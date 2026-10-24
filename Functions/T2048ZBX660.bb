Function T2048ZBX660%(arg0.T402X2Z846)
    If (arg0\Field23 <> "") Then
        If (arg0\Field12 <> Null) Then
            XB86XBXD82(arg0\Field12)
        EndIf
        arg0\Field12 = X44X4F8B46(arg0\Field23, "", FuncPtr(TX066Z08XF2), $00)
        If (arg0\Field12 <> Null) Then
            C0624F0B0(arg0\Field12, (Handle arg0))
            TX4FDBZ228(arg0\Field12, $03)
        Else
            X88D840448(getlocalstring("mpmenu", "connect2"), getlocalstring("mpmenu", "errorcontent"), getlocalstring("gui", "cancel"), "", $00, $00, $01, $00)
        EndIf
        Return $01
    EndIf
    Return $00
    Return $00
End Function
