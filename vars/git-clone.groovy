def call(String url, String branch) {
    echo "📥 Cloning repo from ${url} on branch ${branch}..."
    sh "git clone -b ${branch} ${url}"
    echo "✅ Repo cloned successfully"
}
