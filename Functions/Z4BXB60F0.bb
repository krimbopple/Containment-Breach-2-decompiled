Function Z4BXB60F0%()
    Local local0%
    Local local1.rooms
    T8X2046020\Field4 = blitz_TX28D20DD080()
    T8X2046020\Field0 = blitz_TX28D20DD080()
    FD020X0BZ\Field4 = (blitz_TX28D20DD080() * $3E8)
    local0 = blitz_TX28D20DD080()
    If (local0 <> 0) Then
        For local1 = Each rooms
            T6FD4BDD4Z(local1, local0)
        Next
    EndIf
    X622X42Z04()
    X622X42Z04()
    X2XX6DZ8B8()
    Return $00
End Function
