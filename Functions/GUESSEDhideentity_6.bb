Function GUESSEDhideentity_6%()
    Local local0.items
    For local0 = Each items
        If (local0\Field17 = $00) Then
            positionentity(local0\Field9, entityx(local0\Field9, $00, 1.0), (entityy(local0\Field9, $00, 1.0) + 0.011), entityz(local0\Field9, $00, 1.0), $00)
            hideentity(local0\Field9)
        EndIf
    Next
    Return $00
End Function
