# oci-sm-sample

OCI の Cloud Native Services(OKE, OCI DevOps, OCI Service Mesh) を活用した統合デモコンテンツです。

## ovreview

```bash
$ tree -d
.
├── ci [OCI DevOps - build_spec*.yaml]
├── kubernetes [Kubernetes 関連ファイル]
│   └── service-mesh [OCI Service Mesh 関連ファイル]
├── rest-client [ローカルテスト用スクリプト]
└── src [アプリケーションコード]
    ├── catalog
    │   ├── src
    │   │   ├── main
    │   │   │   ├── java
    │   │   │   │   └── com
    │   │   │   │       └── shukawam
    │   │   │   │           └── catalog
    │   │   │   └── resources
    │   │   │       └── META-INF
    │   │   └── test
    │   │       └── java
    │   │           └── com
    │   │               └── shukawam
    │   │                   └── catalog
    │   └── target
    │       ├── classes
    │       │   ├── com
    │       │   │   └── shukawam
    │       │   │       └── catalog
    │       │   └── META-INF
    │       ├── generated-sources
    │       │   └── annotations
    │       ├── generated-test-sources
    │       │   └── test-annotations
    │       ├── libs
    │       ├── maven-archiver
    │       ├── maven-status
    │       │   └── maven-compiler-plugin
    │       │       ├── compile
    │       │       │   └── default-compile
    │       │       └── testCompile
    │       │           └── default-testCompile
    │       ├── surefire-reports
    │       └── test-classes
    │           └── com
    │               └── shukawam
    │                   └── catalog
    └── client
        ├── src
        │   ├── main
        │   │   ├── java
        │   │   │   └── com
        │   │   │       └── shukawam
        │   │   │           └── client
        │   │   └── resources
        │   │       └── META-INF
        │   └── test
        │       └── java
        │           └── com
        │               └── shukawam
        │                   └── client
        └── target
            ├── classes
            │   ├── com
            │   │   └── shukawam
            │   │       └── client
            │   └── META-INF
            ├── generated-sources
            │   └── annotations
            ├── maven-status
            │   └── maven-compiler-plugin
            │       └── compile
            │           └── default-compile
            └── test-classes
                └── com
                    └── shukawam
                        └── client
```
