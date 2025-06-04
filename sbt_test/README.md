# learning how to user sbt

### building project
$ mkdir sbt_test
$ cd sbt_test
$ touch build.sbt
$ sbt

### compiling
$ sbt
sbt:sbt_test> compile

recompile
sbt:sbt_test> ~compile

## creating scala file
mkdir -p src/main/scala/example
touch src/main/scala/example/Hello.scala


## running app
sbt
sbt:sbt_test> run