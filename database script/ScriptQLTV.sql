/*
Created		6/12/2021
Modified		5/8/2022
Project		
Model			
Company		
Author		
Version		
Database		MS SQL 2005 
*/
CREATE DATABASE QLTV
ON(NAME='QLTV_DATA',FILENAME='C:\SQL\QLTV.MDF')
LOG ON(NAME='QLTV_LOG',FILENAME='C:\SQL\QLTV.LDF')

USE QLTV



Create table [SACH]
(
	[MaSach] Integer Identity(1,1)  ,
	[TenSach] Nvarchar(100) NULL,
	[NamXB] Smallint NULL,
	[SL] Tinyint NULL,
	[MaTL] Integer  ,
	[MAXB] Integer  ,
Primary Key ([MaSach])
) 
go

Create table [PHIEUMUON]
(
	[MaPM] Integer Identity(1,1)  ,
	[ngaymuon] date NULL,
	[ngaytra] date NULL,
	[MaNV] Integer  ,
	[MaThe] Integer  ,
Primary Key ([MaPM])
) 
go

Create table [CT_PHIEUMUON]
(
	[MaSach] Integer  ,
	[MaPM] Integer  ,
	[ghichu] Nvarchar(100),
Primary Key ([MaSach],[MaPM])
) 
go

Create table [DOCGIA]
(
	[MaDG] Integer Identity(1,1)  ,
	[hoten] Nvarchar(40) NULL,
	[diachi] Nvarchar(50) NULL,
	[email] Nvarchar(50) NULL,
	[sdt] Char(10) NULL,
	[ngaysinh] Date NULL,
	[gioitinh] Nvarchar(3) NULL,
	[CCCD] Char(12) NULL,
Primary Key ([MaDG])
) 
go

Create table [THEDG]
(
	[MaThe] Integer Identity(1,1)  ,
	[MaDG] Integer NULL,
	[MaNV] Integer NULL,
	[ngaycap] date NULL,
	[hansd] Tinyint NULL,
	[tinhtrang] Bit  ,
Primary Key ([MaThe])
) 
go

Create table [NHANVIEN]
(
	[MaNV] Integer Identity(1,1)  ,
	[MaCV] Integer  ,
	[hoten] Nvarchar(40) NULL,
	[ngaysinh] Date NULL,
	[phai] Nvarchar(3) NULL,
	[sdt] Char(10) NULL,
	[CCCD] Char(12) NULL,
Primary Key ([MaNV])
) 
go

Create table [PHIEUPHAT]
(
	[MaPP] Integer Identity(1,1)  ,
	[ngayphat] date NULL,
	[phiphat] int NULL,
	[MaNV] Integer,
	[MaSach] Integer,
	[MaPM] Integer,
	[MaLP] Integer,
Primary Key ([MaPP])
) 
go

Create table [THELOAI]
(
	[MaTL] Integer Identity(1,1)  ,
	[TenTL] Nvarchar(100) NULL,
Primary Key ([MaTL])
) 
go

Create table [NHAXB]
(
	[MAXB] Integer Identity(1,1)  ,
	[NXB] Nvarchar(100) NULL,
	[diachi] Nvarchar(100) NULL,
	[sdt] Varchar(10) NULL,
Primary Key ([MAXB])
) 
go

Create table [LEPHI]
(
	[MaLP] Integer Identity(1,1)  ,
	[TenLP] Nvarchar(50) NULL,
	[sotien] int  ,
Primary Key ([MaLP])
) 
go

Create table [TACGIA]
(
	[MaTG] Integer Identity(1,1)  ,
	[TenTG] Nvarchar(50) NULL,
	[DiaChi] Nvarchar(100) NULL,
	[Email] Varchar(50) NULL,
	[CCCD] Char(12) NULL,
Primary Key ([MaTG])
) 
go

Create table [CHUCVU]
(
	[MaCV] Integer Identity(1,1)  ,
	[TenCV] Nvarchar(80) NULL,
	[Luong] int NULL,
Primary Key ([MaCV])
) 
go

Create table [LOAITK]
(
	[MaLTK] Integer Identity(1,1)  ,
	[TenLTK] Nvarchar(60) NULL,
Primary Key ([MaLTK])
) 
go

Create table [TAIKHOAN]
(
	[MaTK] Integer Identity(1,1)  ,
	[MaLTK] Integer  ,
	[MaNV] Integer  ,
	[TenTK] Varchar(50) NULL,
	[MatKhau] Varchar(50) NULL,
Primary Key ([MaTK])
) 
go

Create table [CT_VIET]
(
	[MaSach] Integer  ,
	[MaTG] Integer  ,
	[Vai_Tro] Nvarchar(30)  ,
Primary Key ([MaSach],[MaTG])
) 
go

Create table [PHIEUTRA]
(
	[MAPT] Integer Identity(1,1)  ,
	[MaNV] Integer  ,
	[MaSach] Integer  ,
	[MaPM] Integer  ,
	[ngaytra] date NULL,
	[ghichu] Nvarchar(70) NULL,
Primary Key ([MAPT])
) 
go

Create table [HOADON]
(
	[MAHD] Integer Identity(1,1),
	[MaNV] Integer,
	[MaThe] Integer,
	[ngaylap] date NULL,
	[tongtien] int NULL,
	[ghichu] Nvarchar(100) NULL,
Primary Key ([MAHD])
) 
go

Create table [CT_HOADON]
(
	[MAHD] Integer  ,
	[MaLP] Integer  ,
Primary Key ([MAHD],[MaLP])
) 
go


Alter table [CT_PHIEUMUON] add  foreign key([MaSach]) references [SACH] ([MaSach])  on update CASCADE ON DELETE no action 
go
Alter table [CT_VIET] add  foreign key([MaSach]) references [SACH] ([MaSach])  on update no action ON DELETE CASCADE
go
Alter table [CT_PHIEUMUON] add  foreign key([MaPM]) references [PHIEUMUON] ([MaPM])  on update no action ON DELETE no action
go
Alter table [PHIEUPHAT] add  foreign key([MaSach],[MaPM]) references [CT_PHIEUMUON] ([MaSach],[MaPM])  on update no action ON DELETE no action
go
Alter table [PHIEUTRA] add  foreign key([MaSach],[MaPM]) references [CT_PHIEUMUON] ([MaSach],[MaPM])  on update no action ON DELETE no action
go
Alter table [THEDG] add  foreign key([MaDG]) references [DOCGIA] ([MaDG])  on update CASCADE ON DELETE no action
go
Alter table [THEDG] add  foreign key([MaNV]) references [NHANVIEN] ([MaNV])  on update CASCADE ON DELETE no action
go
Alter table [PHIEUMUON] add  foreign key([MaThe]) references [THEDG] ([MaThe])  on update CASCADE ON DELETE no action
go
Alter table [HOADON] add  foreign key([MaThe]) references [THEDG] ([MaThe])  on update no action ON DELETE no action
go
Alter table [PHIEUMUON] add  foreign key([MaNV]) references [NHANVIEN] ([MaNV])  on update no action ON DELETE no action
go
Alter table [PHIEUPHAT] add  foreign key([MaNV]) references [NHANVIEN] ([MaNV])  on update CASCADE ON DELETE no action
go
Alter table [TAIKHOAN] add  foreign key([MaNV]) references [NHANVIEN] ([MaNV])  on update CASCADE ON DELETE no action
go
Alter table [PHIEUTRA] add  foreign key([MaNV]) references [NHANVIEN] ([MaNV])  on update CASCADE ON DELETE no action
go
Alter table [HOADON] add  foreign key([MaNV]) references [NHANVIEN] ([MaNV])  on update CASCADE ON DELETE no action
go
Alter table [SACH] add  foreign key([MaTL]) references [THELOAI] ([MaTL])  on update CASCADE ON DELETE no action
go
Alter table [SACH] add  foreign key([MAXB]) references [NHAXB] ([MAXB])  on update CASCADE ON DELETE no action 
go
Alter table [PHIEUPHAT] add  foreign key([MaLP]) references [LEPHI] ([MaLP])  on update no action on delete no action 
go
Alter table [CT_HOADON] add  foreign key([MaLP]) references [LEPHI] ([MaLP])  on update no action on delete no action 
go
Alter table [CT_VIET] add  foreign key([MaTG]) references [TACGIA] ([MaTG])  on update no action ON DELETE no action 
go
Alter table [NHANVIEN] add  foreign key([MaCV]) references [CHUCVU] ([MaCV])  on update CASCADE ON DELETE no action 
go
Alter table [TAIKHOAN] add  foreign key([MaLTK]) references [LOAITK] ([MaLTK])  on update CASCADE ON DELETE no action 
go
Alter table [CT_HOADON] add  foreign key([MAHD]) references [HOADON] ([MAHD])  on update CASCADE ON DELETE CASCADE
go




INSERT [dbo].[THELOAI] VALUES (N'Tình cảm')
INSERT [dbo].[THELOAI] VALUES (N'Kinh dị')
INSERT [dbo].[THELOAI] VALUES (N'Giả tưởng - Khoa học viễn tưởng')
INSERT [dbo].[THELOAI] VALUES (N'Self-help')
INSERT [dbo].[THELOAI] VALUES (N'Tiểu sử, hồi kí')
INSERT [dbo].[THELOAI] VALUES (N'Truyện ngắn')
INSERT [dbo].[THELOAI] VALUES (N'Dạy nấu ăn')
INSERT [dbo].[THELOAI] VALUES (N'Bài luận')
INSERT [dbo].[THELOAI] VALUES (N'Lịch sử')
INSERT [dbo].[THELOAI] VALUES (N'Trinh thám')
INSERT [dbo].[THELOAI] VALUES (N'Truyện ngụ ngôn')
INSERT [dbo].[THELOAI] VALUES (N'Sử thi')
INSERT [dbo].[THELOAI] VALUES (N'Thơ')
INSERT [dbo].[THELOAI] VALUES (N'Truyền thuyết')
INSERT [dbo].[THELOAI] VALUES (N'Cổ tích')
INSERT [dbo].[THELOAI] VALUES (N'Truyện cười')
INSERT [dbo].[THELOAI] VALUES (N'Ca dao')
INSERT [dbo].[THELOAI] VALUES (N'Chính trị-Xã hội')
INSERT [dbo].[THELOAI] VALUES (N'Khoa học-Công nghệ')
INSERT [dbo].[THELOAI] VALUES (N'Ngoại ngữ')
INSERT [dbo].[THELOAI] VALUES (N'Kinh tế')
INSERT [dbo].[NHAXB] VALUES (N'Nhà xuất bản Kim Đồng', N'Hà Nội', N'1900571595')
INSERT [dbo].[NHAXB] VALUES (N'Nhà xuất bản tổng hợp TP HCM', N'TP HCM', N'039433868')
INSERT [dbo].[NHAXB] VALUES (N'Nhà xuất bản Chính trị Quốc gia', N'Hà Nội', N'0243822158')
INSERT [dbo].[DOCGIA] VALUES (N'Đào Hồng Hạnh', N'TP.HCM', N'hh@gmail.com', N'0123456789', N'2006-12-04', N'nữ', N'0324563215  ')
INSERT [dbo].[DOCGIA] VALUES (N'Bùi Đình Minh', N'Hà Nội', N'bdm@gmail.com', N'0321456789', N'2001-07-19', N'nam', N'0324563212  ')
INSERT [dbo].[DOCGIA] VALUES (N'Đặng Minh Đức', N'Hà Nội', N'bdm@gmail.com', N'0321456789', N'2001-07-19', N'nam', N'0324563212  ')
INSERT [dbo].[LEPHI] VALUES (N'Tiền mở thẻ', 10000.0000)
INSERT [dbo].[LEPHI] VALUES (N'Tiền thay thẻ', 5000.0000)
INSERT [dbo].[LEPHI] VALUES (N'Phí duy trì', 5000.0000)
INSERT [dbo].[CHUCVU] VALUES (N'Giám đốc', 20000000.0000)
INSERT [dbo].[CHUCVU] VALUES (N'Phó giám đốc', 15000000.0000)
INSERT [dbo].[CHUCVU] VALUES (N'Thủ thư', 10000000.0000)
INSERT [dbo].[NHANVIEN] VALUES (N'1', N'Đặng Minh Đức', N'2001-12-05' , N'Nam', N'039556832 ', N'01145341232 ')
INSERT [dbo].[NHANVIEN] VALUES (N'2', N'Đào Nguyễn Ngọc Đức', N'2001-12-25' , N'Nam', N'0392598628', N'037201024847')
INSERT [dbo].[NHANVIEN] VALUES (N'3', N'Phạm Huyền Trang', N'2001-06-13' , N'Nam', N'0392598628', N'037201024847')
INSERT [dbo].[TACGIA] VALUES (N'Nam Cao', N'Hà Nội', N'namcao@gmail.com', N'01239443    ')
INSERT [dbo].[TACGIA] VALUES (N'Ngô Tất Tố', N'Đông Anh', N'ngott@gmail.com', N'032434545   ')
INSERT [dbo].[TACGIA] VALUES (N'Vũ Trọng Phụng', N'Hà Nội', NULL, NULL)
INSERT [dbo].[TACGIA] VALUES (N'Thạch Lam', N'Hà Nội', NULL, NULL)
INSERT [dbo].[TACGIA] VALUES (N'Nguyễn Tuân', N'Hà Nội', NULL, NULL)
INSERT [dbo].[SACH] VALUES (N'Mắt biếc','2006','4','1','1')
INSERT [dbo].[SACH] VALUES (N'Lão Hạc', '1968', 5, 6, 2)
INSERT [dbo].[SACH] VALUES (N'Vợ nhặt', 1968, 10, 6, 3)
INSERT [dbo].[SACH] VALUES (N'Tắt đèn', 1968, 6, 9, 3)
INSERT [dbo].[CT_VIET] VALUES (2, 1, N'phụ')
INSERT [dbo].[CT_VIET] VALUES (2, 2, N'tác giả')
INSERT [dbo].[CT_VIET] VALUES (3, 1, N'tác giả')
INSERT [dbo].[CT_VIET] VALUES (3, 4, N'chính')
INSERT [dbo].[THEDG] VALUES ('1','3','2022-04-15','4','1')
INSERT [dbo].[THEDG] VALUES ('2','2','2022-04-15','4','0')
INSERT [dbo].[THEDG] VALUES ('3','3','2022-04-15','4','1')
INSERT [dbo].[PHIEUMUON] VALUES ('2022-05-15','2022-05-25','1','1')
INSERT [dbo].[PHIEUMUON] VALUES (N'2022-05-13', N'2022-05-21', 3, 1)
INSERT [dbo].[HOADON] VALUES ('3','1','2022-05-25','0',N'ko co ghi chu')
INSERT [dbo].[HOADON] VALUES ('3','2','2022-05-25','0',N'ko co ghi chu')
INSERT [dbo].[CT_HOADON] VALUES (1, 1)
INSERT [dbo].[CT_HOADON] VALUES (1, 2)
INSERT [dbo].[LOAITK] VALUES ('admin')
INSERT [dbo].[TAIKHOAN] VALUES ('1','1','dmd','123456')
INSERT [dbo].[TAIKHOAN] VALUES ('1','2','dnnd',N'duc123@')
INSERT [dbo].[LOAITK] VALUES (N'Thủ thư')
