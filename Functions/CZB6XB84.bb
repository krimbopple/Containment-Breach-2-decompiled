Function CZB6XB84%()
    Local local0%
    Local local1.XF808F44XB
    Local local2.X82B82400
    For local1 = Each XF808F44XB
        If (local1\Field7 <> 0) Then
            local0 = (local0 + $01)
        EndIf
    Next
    For local2 = Each X82B82400
        If (local2\Field11 <> 0) Then
            local0 = (local0 + $01)
        EndIf
    Next
    Return local0
    Return $00
End Function
