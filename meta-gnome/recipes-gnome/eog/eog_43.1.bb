SUMMARY = "This is the Eye of GNOME, an image viewer program."
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = " \
    librsvg \
    gnome-desktop \
    gsettings-desktop-schemas \
    gdk-pixbuf \
    gtk+3 \
    libhandy \
    libpeas \
    libportal \
    libexif \
    lcms \
"

GNOMEBASEBUILDCLASS = "meson"

inherit gnomebase pkgconfig gsettings gobject-introspection gettext mime-xdg features_check gtk-icon-cache

REQUIRED_DISTRO_FEATURES = "opengl"

SRC_URI[archive.sha256sum] = "fed79ff3ca19bac62f27155c9bdd69eef875870b971e6dcb0aa38c093d131971"

GTKDOC_MESON_OPTION = "gtk_doc"

EXTRA_OEMESON = "-Dxmp=false"

FILES:${PN} += "${datadir}"
