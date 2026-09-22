<template>
  <main class="page">
    <h1>{{ title }}</h1>
    <p class="lead">走行記録のサンプル一覧です。</p>

    <p v-if="loading" class="status">読み込み中...</p>
    <p v-else-if="error" class="status error">{{ error }}</p>
    <table v-else class="diary-table">
      <thead>
        <tr>
          <th>走行日</th>
          <th>距離 (km)</th>
          <th>メモ</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="diary in diaries" :key="diary.diaryId">
          <td>{{ diary.runDate }}</td>
          <td>{{ diary.distanceKm }}</td>
          <td>{{ diary.memo }}</td>
        </tr>
      </tbody>
    </table>
  </main>
</template>

<script setup lang="ts">
import { onMounted, ref } from 'vue'

interface Diary {
  diaryId: number
  runDate: string
  distanceKm: number
  memo: string | null
  createdAt: string
}

const title = 'マラソン日記'
const diaries = ref<Diary[]>([])
const loading = ref(true)
const error = ref<string | null>(null)

onMounted(async () => {
  try {
    const response = await fetch('/api/diaries')
    if (!response.ok) {
      throw new Error(`API エラー: ${response.status}`)
    }
    diaries.value = await response.json()
  } catch (e) {
    error.value = e instanceof Error ? e.message : '日記の取得に失敗しました'
  } finally {
    loading.value = false
  }
})
</script>

<style scoped>
.page {
  max-width: 720px;
  margin: 2rem auto;
  padding: 0 1rem;
  font-family: "Hiragino Sans", "Yu Gothic", sans-serif;
  color: #1a1a1a;
}

.lead {
  margin-bottom: 1.5rem;
  color: #555;
}

.status {
  color: #555;
}

.error {
  color: #b00020;
}

.diary-table {
  width: 100%;
  border-collapse: collapse;
}

.diary-table th,
.diary-table td {
  border-bottom: 1px solid #ddd;
  padding: 0.75rem 0.5rem;
  text-align: left;
}

.diary-table th {
  font-weight: 600;
  color: #333;
}
</style>
