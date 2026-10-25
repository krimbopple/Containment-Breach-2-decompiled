Function Steam_API_Init%()
    Local local0%
    local0 = writefile("steam_appid.txt")
    If (local0 <> $00) Then
        writeline(local0, "3257000")
        closefile(local0)
    EndIf
    If (_Steam_Init() <> $00) Then
        runtimeerror("Fatal Error - Steam must be running to play this game.")
    EndIf
    _Steam_RegisterCallback(FuncPtr(XF6D2F4D48), $1F8)
    _Steam_RegisterCallback(FuncPtr(XD66B0D0B6), $1F9)
    _Steam_RegisterCallback(FuncPtr(FD0XB04X8), $14D)
    _Steam_RegisterCallback(FuncPtr(XF8048F4F8), $4B2)
    _Steam_RegisterCallback(FuncPtr(F6460820X), $837)
    _Steam_RegisterCallback(FuncPtr(T44D684X84), $836)
    _Steam_SetServerListCallback(FuncPtr(XFF26648DX))
    XD82FXFXF4 = $01
    Steam_SetRichPresence("steam_display", "#mainmenu")
    Return $00
End Function
