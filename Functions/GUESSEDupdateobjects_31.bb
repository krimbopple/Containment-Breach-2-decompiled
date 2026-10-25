Function GUESSEDupdateobjects_31%()
    Local local0.TXX0ZX4BDF2
    Local local1%
    For local0 = Each TXX0ZX4BDF2
        For local1 = $00 To $3F Step $01
            If (local0\Field3[local1] <> Null) Then
                Delete local0\Field3[local1]
            EndIf
        Next
        Delete local0
    Next
    Return $01
    Return $00
End Function
