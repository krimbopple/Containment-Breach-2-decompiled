Function Steam_CreateLobby%()
    If (XD82FXFXF4 <> 0) Then
        GUESSEDsetglobal_16($01)
        _Steam_RegisterCallResult(FuncPtr(T24FDB8F64), $201, _Steam_CreateLobby($01, $78))
    EndIf
    Return $00
End Function
