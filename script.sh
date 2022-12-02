echo "##################### BCP ###################"
echo " run script in android-config-version-catalog ..."

echo "clean ..."
./gradlew clean

echo "generateCatalogAsToml ..."
./gradlew generateCatalogAsToml

echo "completed script"
echo "##################### BCP ###################"