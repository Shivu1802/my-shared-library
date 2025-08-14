def call(String project, String ImageTag, String hubUser){
    """
    docker build -t ${hubUser}/${project}:${ImageTag} .
    """
}