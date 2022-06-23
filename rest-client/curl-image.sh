#!/bin/bash

kubectl -n oci-sm-app run -it curl --image=curlimages/curl --rm -- /bin/sh