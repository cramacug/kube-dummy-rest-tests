# Simplest restful services

## Tech stack

| *Tech* |  *Version*|
| --- |  ---|
| Spring boot |  2.4.1|
| Koltin |  1.4.21|
| JVM |  11|
| Mongo |  Version|
| Postgres |  (not implemented)|
| Tech |  (not implemented)|

## V1

    - An endpoint that allows to test the k8s services and do stress tests. The main goal is to test the communication with the k8s.services,
      then communicate with the k8.database and the do some stress test to allow manage dynamically the replicas of the pods.
    - Database is not persisted. 

# Create local docker image

``` shell
# Run the following script with the TAG
$ chmod +x create_local_docker_release.sh 
$ create_local_docker_release.sh VERSION_TAG
```

## Test

    - Open the browser and use the following url http://localhost:8080/create/NEW_NAME where the NEW_NAME is a random name.

## Example

``` shell
    - GET: http://localhost:8080/create/pernil
```

```json
{
  id: 6,
  name: "pernil8f0a5fe8-c25b-41ff-a7c7-eb69e0b6338d",
  ts: "2020-12-27T15:36:03.457157"
}
```
