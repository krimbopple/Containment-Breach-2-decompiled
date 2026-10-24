Function X044BFB6BB%()
    Local local0.TXD6DBZ6XZ4
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    For local0 = Each TXD6DBZ6XZ4
        local4 = $00
        For local1 = $01 To $40 Step $01
            If (local0\Field3\Field58[local1] <> $00) Then
                local4 = local1
            EndIf
        Next
        For local1 = $01 To local4 Step $01
            local2 = $00
            local3 = $00
            If (local0\Field3\Field58[local1] <> $00) Then
                local2 = TFDFXFF244(local0\Field3\Field58[local1])
                local3 = XZZF4F4DZ0(local0\Field3\Field58[local1])
            EndIf
            extractanimseq(local0\Field0, local2, local3, $00, local0\Field3\Field6[local1])
        Next
    Next
    Return $00
End Function
