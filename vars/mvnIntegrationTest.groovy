// Defining function for integrate testing with Maven
def call(){
    sh 'mvn verify -DskipUnitTests'
}