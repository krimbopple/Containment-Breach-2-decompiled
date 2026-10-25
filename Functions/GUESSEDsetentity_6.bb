Function GUESSEDsetentity_6#(arg0.events)
    Local local0#
    Local local1.TX2BF6X0FF4
    arg0\Field21 = 100000.0
    For local1 = Each TX2BF6X0FF4
        If (((local1\Field52 <> $00) And (entityhidden(local1\Field52) = $00)) <> 0) Then
            local0 = GUESSEDgetroomdistance(local1\Field52, arg0\Field19)
            If (((local0 < arg0\Field21) And (0.0 <= local0)) <> 0) Then
                arg0\Field21 = local0
            EndIf
        EndIf
    Next
    Return 0.0
End Function
