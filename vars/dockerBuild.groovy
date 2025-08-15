def call(String ImageName, String ImageTag, String hubUser){
    sh """
    docker build -t ${hubUser}/${ImageName}:${ImageTag} .
    """
}