Function TDZZ2DF64F%()
    Local local0%
    local0 = writefile("steam_appid.txt")
    If (local0 <> $00) Then
        writeline(local0, "3257000")
        closefile(local0)
    EndIf
    If (ZF8802Z8D() <> $00) Then
        runtimeerror("Fatal Error - Steam must be running to play this game.")
    EndIf
    T20086B0XXZ(FuncPtr(XF6D2F4D48), $1F8)
    T20086B0XXZ(FuncPtr(XD66B0D0B6), $1F9)
    T20086B0XXZ(FuncPtr(FD0XB04X8), $14D)
    T20086B0XXZ(FuncPtr(XF8048F4F8), $4B2)
    T20086B0XXZ(FuncPtr(F6460820X), $837)
    T20086B0XXZ(FuncPtr(T44D684X84), $836)
    C0B00Z820(FuncPtr(XFF26648DX))
    XD82FXFXF4 = $01
    XFZ4XXX8D("steam_display", "#mainmenu")
    Return $00
End Function
