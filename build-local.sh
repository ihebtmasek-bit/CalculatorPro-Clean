#!/bin/bash
echo "🚀 Building Z Calculator Pro locally..."

# Nettoyer le projet
./gradlew clean

# Build APK release
echo "📦 Building APK..."
./gradlew assembleRelease

# Build AAB release  
echo "📦 Building AAB..."
./gradlew bundleRelease

echo "✅ Build completed!"
echo "📁 APK: app/build/outputs/apk/release/app-release.apk"
echo "📁 AAB: app/build/outputs/bundle/release/app-release.aab"

# Lister les fichiers générés
find app/build/outputs/ -name "*.apk" -o -name "*.aab" | head -10
