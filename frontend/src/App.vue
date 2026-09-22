<template>
  <main>
    <h1>{{ title }}</h1>
    <p>カウント: {{ count }}</p>
    <button type="button" @click="increment">+1</button>
  </main>
</template>

<script setup lang="ts">
import { ref } from 'vue'

const title: string = 'Marathon Diary'
const count = ref<number>(0)

function increment(): void {
  count.value += 1
}
</script>
