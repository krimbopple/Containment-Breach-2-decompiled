Function GUESSEDdrawcolor_3%()
    Local local0.DBXD0D0XD
    For local0 = Each DBXD0D0XD
        If (0.01 < local0\Field1) Then
            color($FF, $FF, $FF, (Int (local0\Field1 * 255.0)))
            drawimage($00, $00, $00, $01)
        EndIf
    Next
    Return $00
End Function
