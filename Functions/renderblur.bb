Function renderblur%(arg0#)
    entityalpha(arkblurimage, arg0)
    copyrect($00, $00, opt\Field21, opt\Field46, (Int (smallest_power_two_half - (Float TDD0Z6BXB6\Field6))), (Int (smallest_power_two_half - (Float TDD0Z6BXB6\Field9))), backbuffer(), texturebuffer(arkblurtexture, $00))
    Return $00
End Function
