echo "##################### BCP ###################"
echo " run script in android-config-version-catalog ..."

./gradlew clean

./gradlew generateCatalogAsToml

echo "completed script"
echo "##################### BCP ###################"