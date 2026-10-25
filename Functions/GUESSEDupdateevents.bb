Function GUESSEDupdateevents%(arg0%)
    If (arg0 <> 0) Then
        If (selecteditem = Null) Then
            GUESSEDsetglobal_12($03, $03, -2.0, 0.0, 1.0)
        EndIf
        selecteditem = Null
    EndIf
    Return $00
End Function
