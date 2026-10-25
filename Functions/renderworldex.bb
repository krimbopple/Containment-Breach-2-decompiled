Function renderworldex%(arg0#)
    Local local0%
    Local local1%
    Local local2%
    cameraprojmode(camera, $01)
    cameraviewport(camera, $00, $00, opt\Field21, opt\Field46)
    If (T8660BZ460\Field5 = $00) Then
        GUESSEDrendertex(camera, arg0, opt\Field77, opt\Field77, $00, $00)
    EndIf
    cameraviewport(camera, $00, $00, opt\Field21, opt\Field46)
    cameraprojmode(camera, $00)
    If (T8660BZ460\Field5 = $00) Then
        For local0 = $00 To $0C Step $01
            local1 = X2Z260BF0Z\Field1[local0]
            If (((local1 <> $00) And (entityhidden(local1) = $00)) <> 0) Then
                local2 = getentitytexturebuffer(local1, $00, $00)
                If (local2 <> $00) Then
                    color(entitycolorr(local1), entitycolorg(local1), entitycolorb(local1), (Int (255.0 * getentityalpha(local1))))
                    drawbuffer(local2, $00, $00, opt\Field21, opt\Field46, getentityblend(local1))
                EndIf
            EndIf
        Next
        If (((arkblurimage <> $00) And (entityhidden(arkblurimage) = $00)) <> 0) Then
            local2 = getentitytexturebuffer(arkblurimage, $00, $00)
            If (local2 <> $00) Then
                color(entitycolorr(arkblurimage), entitycolorg(arkblurimage), entitycolorb(arkblurimage), (Int (255.0 * getentityalpha(arkblurimage))))
                drawbufferrect(local2, $00, $00, opt\Field21, opt\Field46, (Int (smallest_power_two_half - (Float TDD0Z6BXB6\Field6))), (Int (smallest_power_two_half - (Float TDD0Z6BXB6\Field9))), opt\Field21, opt\Field46, getentityblend(arkblurimage))
            EndIf
        EndIf
    EndIf
    Return $00
End Function
