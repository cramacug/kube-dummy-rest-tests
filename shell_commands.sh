mkdir -p build/dependency && (cd build/dependency; jar -xf ../libs/*.jar)
docker build --build-arg DEPENDENCY=build/dependency -t kube/rest:"$1" .

docker run -p 8080:8080 kube/rest:v2

# ./gradlew bootBuildImage --imageName=kube/rest:v2
