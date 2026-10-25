Function GUESSEDcheckvalue_43%(arg0$)
    If (((GUESSEDupdateanimatenpc() = $00) Lor (arg0 = "")) <> 0) Then
        Return $00
    EndIf
    GUESSEDcallsetglobal(arg0, $00)
    GUESSEDupdatetxxf_3(Null, arg0, $00)
    Return $00
End Function
