def call(String imageName, String tag='latest') {
    echo "Building for Deployment"
    // Building the image with default tag if not specified
    sh "docker build -t ${imageName}:${tag} ."
    echo "Build Complete"
}
