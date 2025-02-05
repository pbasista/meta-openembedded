SUMMARY = "Code coverage measurement for Python"
HOMEPAGE = "https://coverage.readthedocs.io"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2ee41112a44fe7014dce33e26468ba93"

SRC_URI[sha256sum] = "d5be4e93acce64f516bf4fd239c0e6118fc913c93fa1a3f52d15bdcc60d97b2d"

inherit pypi setuptools3

RDEPENDS:${PN} += " \
	${PYTHON_PN}-sqlite3 \
	${PYTHON_PN}-core \
	${PYTHON_PN}-pprint \
	${PYTHON_PN}-json \
	${PYTHON_PN}-xml \
	${PYTHON_PN}-crypt \
	${PYTHON_PN}-shell \
	${PYTHON_PN}-io \
	${PYTHON_PN}-toml \
	${PYTHON_PN}-multiprocessing \
"
