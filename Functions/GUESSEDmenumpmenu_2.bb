Function GUESSEDmenumpmenu_2%(arg0.T402X2Z846)
    If (arg0\Field23 <> "") Then
        If (arg0\Field12 <> Null) Then
            GUESSEDsetfield_16(arg0\Field12)
        EndIf
        arg0\Field12 = Steam_DownloadFile(arg0\Field23, "", FuncPtr(TX066Z08XF2), $00)
        If (arg0\Field12 <> Null) Then
            GUESSEDsetfield_2(arg0\Field12, (Handle arg0))
            GUESSEDsetfield_8(arg0\Field12, $03)
        Else
            GUESSEDresetresetinput(getlocalstring("mpmenu", "connect2"), getlocalstring("mpmenu", "errorcontent"), getlocalstring("gui", "cancel"), "", $00, $00, $01, $00)
        EndIf
        Return $01
    EndIf
    Return $00
    Return $00
End Function
