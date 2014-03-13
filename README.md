Arabic Font Example
=====================
Render arabic font using native JNE

### Library List ###
Important library list :

1. Free Type ([https://android.googlesource.com/platform/external/freetype.git](https://android.googlesource.com/platform/external/freetype.git "Free Type"))
2. Harfbuzz, for text shaping. ([https://github.com/arkusuma/harfbuzz-android](https://github.com/arkusuma/harfbuzz-android "Harbuzz Android"))

### How to use ###
1. Make sure that your class & package is exactly same as written in your jni source code (*.c)
2. Change your native text android textview to ArabicTextView in your layout xml. The complete name is depends on your package & class name of your `ArabicTextView` class name
3. Copy the `jni` and `obj` folder. The jni contain the c-code, and the obj contain the compiled library. If you interest to compile your own version, please refer to free type and harfbuzz library repo.
4. Don't forget to add the apropriate font in your assets
5. Please, DO NOT add extra font manipulation in your code. It may broke the layout / the arabic view

### Acknowledgement ###
Parts of this example were taken from [https://github.com/arkusuma/quran-android](https://github.com/arkusuma/quran-android) 