reminder to manually deploy a local build to melande.inria.fr  (nightly)

after a successful build (not error, no failed test)

from the root of the repository

```
ant -Denv.WORKSPACE=`pwd` -Dkey.file=~/.ssh/kermeta_bot/id_rsa -f releng/fr.inria.diverse.melange.releng.root/promotion_build.xml
```