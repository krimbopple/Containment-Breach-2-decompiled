Function T2026X80F28%()
    Local local0.TX2BF6X0FF4
    If (TXB2BFFFFFX() = $00) Then
        Return $00
    EndIf
    For local0 = Each TX2BF6X0FF4
        If (local0\Field13 > $01) Then
            TX268604BB2(local0)
        EndIf
    Next
    Return $00
End Function
