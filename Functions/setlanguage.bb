Function setlanguage%(arg0$, arg1%)
    If (lang\Field0 <> "") Then
        TXBXX6FF8BB((lang\Field0 + "Data\local.ini"))
        TXBXX6FF8BB((lang\Field0 + "Data\fonts.ini"))
        TXBXX6FF8BB((lang\Field0 + "Data\achievements.jsonc"))
    EndIf
    lang\Field1 = arg0
    If (lang\Field1 = "en") Then
        lang\Field0 = ""
    Else
        lang\Field0 = (("Localization\" + lang\Field1) + "\")
        iniwritebuffer((lang\Field0 + "Data\local.ini"), $01)
        TXDXDF2D428((lang\Field0 + "Data\local.ini"), (lang\Field0 + "Data\MP_local.ini"))
        iniwritebuffer((lang\Field0 + "Data\fonts.ini"), $01)
        iniwritebuffer((lang\Field0 + "Data\achievements.jsonc"), $01)
    EndIf
    If (stringtoboolean(getlocalstring("global", "splitwithspace"), $00) <> 0) Then
        splitspace = " "
    Else
        splitspace = ""
    EndIf
    opt\Field22 = arg0
    initkeynames()
    If (XD00026ZX2\Field0[$00] <> $00) Then
        freefont(XD00026ZX2\Field0[$00])
    EndIf
    XD00026ZX2\Field0[$00] = loadfont_strict(("GFX\Fonts\" + getfilelocalstring("Data\fonts.ini", "Default", "File", "", $01)), (Int getfilelocalstring("Data\fonts.ini", "Default", "Size", "", $01)), $01)
    If (arg1 <> 0) Then
        apptitle(getlocalstring("mplanguage", "title"), "")
    Else
        apptitle(getlocalstring("mplauncher", "title"), "")
    EndIf
    Return $00
End Function
