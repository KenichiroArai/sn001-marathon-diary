# マラソン日記

ランニングの走行記録を残すサンプルアプリケーションです。

- バックエンド: Spring Boot + DBFlute 1.3.1
- フロントエンド: Vue 3 + Vite
- データベース: PostgreSQL 16（Docker のみ利用）

## 前提

| ツール | 用途 |
|--------|------|
| Docker / Docker Compose | PostgreSQL の起動 |
| JDK 25 | アプリ実行 |
| Maven 3.9+ | ビルド・DBFlute タスク |
| Node.js 20+ | フロントエンドビルド |

## 接続情報

| 項目 | 値 |
|------|-----|
| Host | `localhost` |
| Port | `5432` |
| Database | `marathon` |
| User | `marathon` |
| Password | `marathon` |
| JDBC URL | `jdbc:postgresql://localhost:5432/marathon` |

## 1. PostgreSQL を起動する

プロジェクト直下（本 README と同じディレクトリ）で:

```bash
docker compose up -d
```

停止する場合:

```bash
docker compose down
```

## 2. DBFlute（1.3.1）

DBFlute Engine / Runtime は **1.3.1** を使用します。  
（[DBFlute-1.3.1 Released](https://jflute.hatenadiary.jp/entry/20260101/release131)）

### 初回セットアップ（未実施の場合）

```bash
mvn dbflute:download
mvn dbflute:create-client
```

JDBC ドライバをクライアントの `extlib` に配置します（ReplaceSchema / JDBC タスク用）:

```bash
mvn -q dependency:copy-dependencies -DincludeArtifactIds=postgresql -DoutputDirectory=dbflute_marathon/extlib
```

### スキーマ構築（ReplaceSchema）

DDL は `dbflute_marathon/playsql/replace-schema.sql`、  
サンプルデータは `dbflute_marathon/playsql/data/ut/tsv/UTF-8/10-diary.tsv` です。

```bash
cd dbflute_marathon
# Windows (PowerShell)
$env:answer='y'; $env:pause_at_end='n'; cmd /c "manage.bat replace-schema"
```

### クラス生成（JDBC → Generate）

```bash
cd dbflute_marathon
$env:pause_at_end='n'; cmd /c "manage.bat jdbc"
$env:pause_at_end='n'; cmd /c "manage.bat generate"
```

生成クラスは `src/main/java/kmg/sn/sn001/dbflute/` 配下に出力されます。

## 3. フロントエンドをビルドする

```bash
cd frontend
npm install
npm run build
```

成果物は `src/main/resources/static/` に出力され、Spring Boot から配信されます。

開発時は Vite の proxy で API を転送できます。

```bash
# ターミナル1: Spring Boot
mvn spring-boot:run

# ターミナル2: Vite
cd frontend
npm run dev
```

## 4. アプリケーションを起動する

```bash
mvn spring-boot:run
```

ブラウザで http://localhost:8080/ を開くと、日記一覧が表示されます。

### API

| Method | Path | 説明 |
|--------|------|------|
| GET | `/api/diaries` | 走行記録一覧（走行日の降順） |

## ディレクトリ概要

```
sn001-marathon-diary/
├── docker-compose.yml      # PostgreSQL のみ
├── dbflute_marathon/       # DBFlute クライアント
├── mydbflute/              # DBFlute Engine 1.3.1
├── frontend/               # Vue アプリ
└── src/main/java/          # Spring Boot + 生成コード
```
