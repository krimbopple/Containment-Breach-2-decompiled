Function GUESSEDsetentry_2%(arg0%, arg1%)
    Local local0%
    Local local1.T402X2Z846
    local0 = $00
    For local1 = Each T402X2Z846
        If (local1\Field10 = arg0) Then
            GUESSEDwritesend(local1\Field29, local1\Field16, $00, local0)
            local1\Field8 = $00
            local0 = (local0 + arg1)
        EndIf
    Next
    Return $00
End Function
