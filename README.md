# oci-sm-sample

OCI の Cloud Native Services(OKE, OCI DevOps, OCI Service Mesh) を活用した統合デモコンテンツです。

## ovreview

```bash
$ tree
.
├── ci
│   ├── build_spec_catalog.yaml [Catalog の Build Pipeline 制御ファイル]
│   └── build_spec_client.yaml　[Client の Build Pipeline 制御ファイル]
├── kubernetes
│   ├── catalog-v1.yaml [Catalog-v1 の Manifest file]
│   ├── catalog-v2.yaml [Catalog-v2 の Manifest file]
│   ├── client.yaml [Client の Manifest file]
│   └── service-mesh [OCI Service Mesh の Manifest file]
│       ├── binding.yaml
│       ├── ingress.yaml
│       └── meshify.yaml
├── README.md
├── rest-client [ローカル動作確認用のスクリプト(for VSCode REST Client)]
│   ├── catalog.http
│   └── client.http
└── src [Catalog/Client の実装]
    ├── catalog
    │   ├── Dockerfile
    │   ├── Dockerfile.jlink
    │   ├── Dockerfile.native
    │   ├── pom.xml
    │   ├── README.md
    │   └── src
    │       ├── main
    │       │   ├── java
    │       │   │   └── com
    │       │   │       └── shukawam
    │       │   │           └── catalog
    │       │   │               ├── Catalog.java
    │       │   │               ├── CatalogResource.java
    │       │   │               ├── CatalogService.java
    │       │   │               ├── Department.java
    │       │   │               ├── GreetingProvider.java
    │       │   │               ├── GreetResource.java
    │       │   │               └── package-info.java
    │       │   └── resources
    │       │       ├── logging.properties
    │       │       └── META-INF
    │       │           ├── beans.xml
    │       │           └── microprofile-config.properties
    │       └── test
    │           └── java
    │               └── com
    │                   └── shukawam
    │                       └── catalog
    │                           └── MainTest.java
    └── client
        ├── Dockerfile
        ├── Dockerfile.jlink
        ├── Dockerfile.native
        ├── pom.xml
        ├── README.md
        └── src
            ├── main
            │   ├── java
            │   │   └── com
            │   │       └── shukawam
            │   │           └── client
            │   │               ├── Catalog.java
            │   │               ├── CatalogRestClient.java
            │   │               ├── ClientResource.java
            │   │               ├── Department.java
            │   │               ├── GreetingProvider.java
            │   │               ├── GreetResource.java
            │   │               └── package-info.java
            │   └── resources
            │       ├── logging.properties
            │       └── META-INF
            │           ├── beans.xml
            │           └── microprofile-config.properties
            └── test
                └── java
                    └── com
                        └── shukawam
                            └── client
                                └── MainTest.java
```
