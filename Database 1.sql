DROP DATABASE IF EXISTS QLYTHUVIEN;
create database QLYTHUVIEN;
use QLYTHUVIEN;
DROP TABLE IF EXISTS SACH;
CREATE TABLE SACH(
masach int not null primary key auto_increment, 
ten varchar(500),
tacgia varchar(500),
nxb varchar(500),
soluong int 
);
DROP TABLE IF EXISTS DOCGIA;
create TABLE DOCGIA(
sothe int not null primary key auto_increment,
ten varchar(500),
khoa varchar(500),
khoahoc varchar(500),
thoihanthe date
);
DROP TABLE IF EXISTS PHIEUMUON;
CREATE TABLE PHIEUMUON(
masach int ,
sothe  int not null,
ngaymuon date,
ngaytra date,
ghichu nvarchar(1000),
constraint primary key (masach, sothe),
foreign key (masach) references SACH(masach),
foreign key (sothe) references DOCGIA(sothe)
);
insert into SACH(masach,ten, tacgia, nxb, soluong) values ("001","JAVA sinh vien", "Nguyen Thanh Chung", "MXB Quốc Gia", 20);
insert into SACH(masach,ten, tacgia, nxb, soluong) values ("002","Web pro", "Phạm Trung Kiên", "MXB Tuoi tre", 30);
insert into SACH(masach,ten, tacgia, nxb, soluong) values ("003","Co so du lieu", "Linh Chi", "MXB Giao duc", 20);
insert into SACH(masach,ten, tacgia, nxb, soluong) values ("004","Dac Nhan Tam", "Dale Carnegie", "MXB Tuoi tre", 40);
insert into SACH(masach,ten, tacgia, nxb, soluong) values ("005","toan", "Nguyen Nam", "MXB Giao duc", 20);

insert into DOCGIA(ten, khoa, khoahoc, thoihanthe) values("Dang Tien Duong", "TH22", "TH", '2019-01-01');
insert into DOCGIA(ten, khoa, khoahoc, thoihanthe) values("Tran Minh Tu", "TH22", "TH", '2019-01-01');
insert into DOCGIA(ten, khoa, khoahoc, thoihanthe) values("Le Quang Huy", "TA22", "TA", '2019-01-01');
insert into DOCGIA(ten, khoa, khoahoc, thoihanthe) values("Nguyen Huy Hai", "DL22", "DT", '2019-02-01');
insert into DOCGIA(ten, khoa, khoahoc, thoihanthe) values("Cao Van Tuan", "TC22", "TC", '2019-01-01');

insert into PHIEUMUON(masach, sothe, ngaymuon, ngaytra, ghichu) values(001, 1, '2018-01-01', '2018-01-10', "Da muon");
insert into PHIEUMUON(masach, sothe, ngaymuon, ngaytra, ghichu) values(002, 2, '2018-01-02', '2018-01-11', "Da muon");
insert into PHIEUMUON(masach, sothe, ngaymuon, ngaytra, ghichu) values(003, 3, '2018-01-03', '2018-01-12', "Da muon");
insert into PHIEUMUON(masach, sothe, ngaymuon, ngaytra, ghichu) values(004, 4, '2018-01-04', '2018-01-13', "Da muon");
insert into PHIEUMUON(masach, sothe, ngaymuon, ngaytra, ghichu) values(005, 5, '2018-01-01', '2018-01-14', "Da muon");

select * from SACH
order by soluong, ten desc;

SELECT PHIEUMUON.masach, SACH.ten, COUNT(PHIEUMUON.masach) as 'solanmuon' FROM QLYTHUVIEN.PHIEUMUON
JOIN QLYTHUVIEN.SACH 
ON PHIEUMUON.masach = SACH.masach
GROUP BY masach
ORDER BY solanmuon desc
LIMIT 1

SELECT d.ten from PHIEUMUON p
join SACH s on s.masach = p.masach 
join DOCGIA d on d.sothe = p.sothe
where s.ten = 'Toan' and p.ngaymuon = '2018-01-01'

--7
select d.sothe, d.ten, s.ten from PHIEUMUON p
join SACH s on s.masach = p.masach 
join DOCGIA d on d.sothe = p.sothe
where p.ngaymuon ='2018-01'
--8
select s.* from SACH s
where s.masach not in (select masach from PHIEUMUON)
--9
select count(*) as 'soluong' from PHIEUMUON p
join DOCGIA d on d.sothe = p.sothe
where d.ten = 'Dang Tien Duong'

-- 10
select d.* from PHIEUMUON p
join DOCGIA d on d.sothe = p.sothe
where p.ngaytra is null
