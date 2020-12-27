mkdir -p build/dependency && (cd build/dependency; jar -xf ../libs/*.jar)

docker build --build-arg DEPENDENCY=build/dependency -t kube/rest:v1 .

# ./gradlew bootBuildImage --imageName=kube/rest:v2
