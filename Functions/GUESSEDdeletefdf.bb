Function GUESSEDdeletefdf%()
    Local local0%
    Local local1.items
    Repeat
        Repeat
            local0 = blitz_T20024FDF4X0()
            If (local0 = $00) Then
                Goto section__4104
            EndIf
            If (local0 = $FFFFFFFF) Then
                GUESSEDdeleteremoveitem(blitz_T20024FDF4X0())
            Forever
        EndIf
        GUESSEDfreeentity(local0)
    Forever
.section__4104
    For local1 = Each items
        If (local1\Field42 = $00) Then
            removeitem(local1, $00)
        EndIf
    Next
    Return $00
End Function
