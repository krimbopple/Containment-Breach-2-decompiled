Function XF66828X2X%(arg0%)
    Local local0$
    Local local1%
    Local local2.TBZZ66Z8FZ
    If (F24284F28[arg0] = Null) Then
        local0 = ""
        local1 = $00
        For local2 = Each TBZZ66Z8FZ
            If ((local2\Field0 And arg0) <> $00) Then
                If ((local2\Field0 And ZXZFD24XF) = $00) Then
                    local0 = ((local0 + local2\Field1) + " ")
                EndIf
                local1 = (local1 Or local2\Field0)
            EndIf
        Next
        If (local1 <> arg0) Then
            Return $00
        EndIf
        If (E06864Z8D(arg0, "Input.fx", (local0 + "REVERSEDZ")) = $00) Then
            Return $00
        EndIf
    EndIf
    Return F24284F28[arg0]\Field1
    Return $00
End Function
