require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "u-boot for TechNexion boards."
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"

PROVIDES += "u-boot"

SRCBRANCH = "tn-imx_v2016.03_4.1.15_2.0.0_ga"
SRCREV = "f9b673187642a92ede7032eef97085bc492a33ef"
SRC_URI = "git://github.com/TechNexion/u-boot-edm.git;branch=${SRCBRANCH} \
           "

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
