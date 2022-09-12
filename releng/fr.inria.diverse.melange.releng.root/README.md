reminder to manually deploy a local build to melande.inria.fr  (nightly)



after a successful build (not error, no failed test)
## local build from the root of the repository

simple build (if already verified on the CI
``
mvn clean package --file releng/fr.inria.diverse.melange.releng.root/pom.xml
```

build and test
``
mvn clean verify --file releng/fr.inria.diverse.melange.releng.root/pom.xml
```



## Deploy from local build
from the root of the repository
```
ant -Denv.WORKSPACE=`pwd` -Dkey.file=~/.ssh/kermeta_bot/id_rsa -f releng/fr.inria.diverse.melange.releng.root/promotion_build.xml
```