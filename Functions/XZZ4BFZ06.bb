Function XZZ4BFZ06%(arg0.DBXD0D0XD)
    Local local0%
    Local local1%
    If (arg0 = Null) Then
        local0 = $00
        For arg0 = Each DBXD0D0XD
            local0 = (local0 + $01)
        Next
        local1 = rand($00, (local0 - $01))
        local0 = $00
        For arg0 = Each DBXD0D0XD
            If (local0 = local1) Then
                If (X0X6XBXZD <> Null) Then
                    X0X6XBXZD\Field0 = $00
                EndIf
                X0X6XBXZD = arg0
                arg0\Field0 = $01
                Exit
            EndIf
            local0 = (local0 + $01)
        Next
    Else
        If (X0X6XBXZD <> Null) Then
            X0X6XBXZD\Field0 = $00
        EndIf
        X0X6XBXZD = arg0
        arg0\Field0 = $01
    EndIf
    Return $00
End Function
