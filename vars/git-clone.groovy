def clone(String url, String branch) {
    echo "📥 Cloning repo from ${url} on branch ${branch}..."
    git branch: branch, url: url
}
