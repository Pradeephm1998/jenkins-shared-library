def call(String repoUrl, String branchName = 'main') {
    git branch: branchName,
        url: repoUrl
}
