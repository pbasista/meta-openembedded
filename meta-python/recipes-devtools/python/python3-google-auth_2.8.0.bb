DESCRIPTION = "Google Authentication Library"
HOMEPAGE = "https://github.com/googleapis/google-auth-library-python"
AUTHOR = "Google Cloud Platform"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

inherit pypi setuptools3

SRC_URI[sha256sum] = "819b70140d05501739e1387291d39f0de3b4dff3b00ae4aff8e7a05369957f89"

RDEPENDS:${PN} += "\
    ${PYTHON_PN}-asyncio \
    ${PYTHON_PN}-datetime \
    ${PYTHON_PN}-io \
    ${PYTHON_PN}-json \
    ${PYTHON_PN}-logging \
    ${PYTHON_PN}-netclient \
    ${PYTHON_PN}-numbers \
"

RDEPENDS:${PN} += "\
    ${PYTHON_PN}-aiohttp \
    ${PYTHON_PN}-cachetools \
    ${PYTHON_PN}-pyasn1-modules \
    ${PYTHON_PN}-rsa \
    ${PYTHON_PN}-six \
"