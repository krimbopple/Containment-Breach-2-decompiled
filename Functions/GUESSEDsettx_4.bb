Function GUESSEDsettx_4%()
    Local local0%
    Local local1.rooms
    T8X2046020\Field4 = blitz_TX28D20DD080()
    T8X2046020\Field0 = blitz_TX28D20DD080()
    FD020X0BZ\Field4 = (blitz_TX28D20DD080() * $3E8)
    local0 = blitz_TX28D20DD080()
    If (local0 <> 0) Then
        For local1 = Each rooms
            GUESSEDcreategift(local1, local0)
        Next
    EndIf
    GUESSEDtxfunc()
    GUESSEDtxfunc()
    GUESSEDdeletefdf()
    Return $00
End Function
