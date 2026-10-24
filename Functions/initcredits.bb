Function initcredits%()
    Local local0.creditsline
    Local local1%
    Local local2$
    local1 = openfile_strict("Credits.txt")
    XD00026ZX2\Field0[$06] = loadfont_strict(("GFX\Fonts\" + getfilelocalstring("Data\fonts.ini", "Credits", "File", "", $01)), (Int getfilelocalstring("Data\fonts.ini", "Credits", "Size", "", $01)), $00)
    XD00026ZX2\Field0[$07] = loadfont_strict(("GFX\Fonts\" + getfilelocalstring("Data\fonts.ini", "Credits_Big", "File", "", $01)), (Int getfilelocalstring("Data\fonts.ini", "Credits_Big", "Size", "", $01)), $00)
    If (XZ0260X8X2\Field67 = $00) Then
        XZ0260X8X2\Field67 = scaleimageex(loadimage_strict("GFX\Menu\credits_screen.png"), menuscale, menuscale, $01)
    EndIf
    Repeat
        local2 = readline(local1)
        local0 = (New creditsline)
        local0\Field2 = local2
    Until (eof(local1) <> 0)
    Delete (First creditsline)
    XZ0260X8X2\Field50 = 0.0
    Return $00
End Function
