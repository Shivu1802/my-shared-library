def call(String project, String ImageTag, String hubUser) {
    // Scan the Docker image using Trivy
    """
    trivy image ${hubUser}/${project}:${ImageTag} > scan.txt --exit-code 1 --severity HIGH,CRITICAL --no-progress
    cat scan.txt
    """
}