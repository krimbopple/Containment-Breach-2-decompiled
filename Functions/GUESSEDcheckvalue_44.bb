Function GUESSEDcheckvalue_44%(arg0$)
    If (GUESSEDupdateanimatenpc() <> 0) Then
        If (MP_ChatCommand(arg0) = $00) Then
            GUESSEDupdatetxxf_3(TXXF6F02DB2[GUESSEDupdatedropitem()], ((opt\Field75 + ": ") + arg0), $00)
        EndIf
        Return $00
    EndIf
    GUESSEDtxxffunc_6(arg0)
    Return $00
End Function
