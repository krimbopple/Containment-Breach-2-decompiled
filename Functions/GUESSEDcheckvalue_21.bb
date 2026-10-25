Function GUESSEDcheckvalue_21%(arg0%)
    If (TX4DBZFX8BB[arg0] = Null) Then
        Return $00
    EndIf
    Delete TX4DBZFX8BB[arg0]
    Return $00
End Function
